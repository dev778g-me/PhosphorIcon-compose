package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.PillLight: ImageVector
    get() {
        if (_PillLight != null) {
            return _PillLight!!
        }
        _PillLight = ImageVector.Builder(
            name = "Light.PillLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(45.25f, 146.75f)
                lineTo(146.75f, 45.25f)
                arcTo(45.25f, 45.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 210.74f, 45.25f)
                lineTo(210.75f, 45.26f)
                arcTo(45.25f, 45.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 210.75f, 109.25f)
                lineTo(109.25f, 210.75f)
                arcTo(45.25f, 45.25f, 73.15f, isMoreThanHalf = false, isPositiveArc = true, 45.26f, 210.75f)
                lineTo(45.25f, 210.75f)
                arcTo(45.25f, 45.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 45.25f, 146.75f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 96f)
                lineTo(160f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 112f)
                lineTo(184f, 88f)
            }
        }.build()

        return _PillLight!!
    }

@Suppress("ObjectPropertyName")
private var _PillLight: ImageVector? = null
