package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.TextAaDuotone: ImageVector
    get() {
        if (_TextAaDuotone != null) {
            return _TextAaDuotone!!
        }
        _TextAaDuotone = ImageVector.Builder(
            name = "Duotone.TextAaDuotone",
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
                moveTo(168f, 164f)
                arcToRelative(32f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
                arcToRelative(32f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -64f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(125.18f, 152f)
                lineToRelative(-90.36f, 0f)
                lineToRelative(45.18f, -96f)
                lineToRelative(45.18f, 96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 192f)
                lineToRelative(-64f, -136f)
                lineToRelative(-64f, 136f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 164f)
                arcToRelative(32f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
                arcToRelative(32f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -64f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 192f)
                verticalLineTo(132f)
                curveToRelative(0f, -15.46f, -14.33f, -28f, -32f, -28f)
                curveToRelative(-9.56f, 0f, -18.14f, 2.18f, -24f, 8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(125.18f, 152f)
                lineTo(34.82f, 152f)
            }
        }.build()

        return _TextAaDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TextAaDuotone: ImageVector? = null
