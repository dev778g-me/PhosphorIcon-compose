package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.FlagCheckeredDuotone: ImageVector
    get() {
        if (_FlagCheckeredDuotone != null) {
            return _FlagCheckeredDuotone!!
        }
        _FlagCheckeredDuotone = ImageVector.Builder(
            name = "Duotone.FlagCheckeredDuotone",
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
                moveTo(168f, 129.48f)
                curveToRelative(17.76f, 4.91f, 36.1f, 3.75f, 56f, -13.48f)
                verticalLineTo(56f)
                curveToRelative(-19.89f, 17.23f, -38.24f, 18.39f, -56f, 13.48f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(104f, 162.52f)
                curveToRelative(21.62f, 6f, 42.38f, 21f, 64f, 27f)
                verticalLineToRelative(-60f)
                curveToRelative(-21.63f, -6f, -42.38f, -21f, -64f, -27f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(48f, 116f)
                curveToRelative(19.89f, -17.23f, 38.24f, -18.39f, 56f, -13.48f)
                verticalLineToRelative(-60f)
                curveTo(86.24f, 37.61f, 67.89f, 38.77f, 48f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 69.48f)
                lineTo(168f, 189.48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 116f)
                curveToRelative(64f, -55.43f, 112f, 55.43f, 176f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 42.52f)
                lineTo(104f, 162.52f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 176f)
                curveToRelative(64f, -55.43f, 112f, 55.43f, 176f, 0f)
                verticalLineTo(56f)
                curveTo(160f, 111.43f, 112f, 0.57f, 48f, 56f)
                verticalLineTo(224f)
            }
        }.build()

        return _FlagCheckeredDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FlagCheckeredDuotone: ImageVector? = null
