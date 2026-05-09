package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.EggCrackDuotone: ImageVector
    get() {
        if (_EggCrackDuotone != null) {
            return _EggCrackDuotone!!
        }
        _EggCrackDuotone = ImageVector.Builder(
            name = "Duotone.EggCrackDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(208f, 152f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -160f, 0f)
                curveTo(48f, 88f, 96f, 24f, 128f, 24f)
                reflectiveCurveTo(208f, 88f, 208f, 152f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 152f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -160f, 0f)
                curveTo(48f, 88f, 96f, 24f, 128f, 24f)
                reflectiveCurveTo(208f, 88f, 208f, 152f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 152f)
                lineToRelative(8f, -40f)
                lineToRelative(-32f, -8f)
                lineToRelative(44.68f, -50.07f)
            }
        }.build()

        return _EggCrackDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _EggCrackDuotone: ImageVector? = null
