package com.isthisteamisthis.umchiumtee.user.command.domain.aggregate.vo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
public class MinRangeVO {

    @Column
    private Float minFreq;

    @Column
    private String minNote;

    @Column
    private String minOctave;
}
