package br.com.cadastro.cliente.api;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DataOutput<T> {

    private T data;

    public static <T> DataOutput<T> whit(final T data) {
        return new DataOutput<>(data);
    }
}
