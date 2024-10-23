package conductance.api.registry;

import java.util.Objects;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class RegistryObject<KEY> implements IRegistryObject<KEY> {

	private final KEY registryKey;

	@Override
	public int hashCode() {
		return this.registryKey.hashCode();
	}

	@Override
	public boolean equals(final Object obj) {
		return obj instanceof final RegistryObject<?> regObj && Objects.equals(this.registryKey, regObj.registryKey);
	}

	@Override
	public String toString() {
		return this.registryKey.toString();
	}
}