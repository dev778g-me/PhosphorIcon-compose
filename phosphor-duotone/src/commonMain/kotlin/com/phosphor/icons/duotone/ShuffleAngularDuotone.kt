package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ShuffleAngularDuotone: ImageVector
    get() {
        if (_ShuffleAngularDuotone != null) {
            return _ShuffleAngularDuotone!!
        }
        _ShuffleAngularDuotone = ImageVector.Builder(
            name = "Duotone.ShuffleAngularDuotone",
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
                moveTo(32f, 184f)
                lineToRelative(56f, 0f)
                lineToRelative(80f, -112f)
                lineToRelative(64f, 0f)
                lineToRelative(0f, 112f)
                lineToRelative(-64f, 0f)
                lineToRelative(-80f, -112f)
                lineToRelative(-56f, 0f)
                lineToRelative(0f, 112f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 72f)
                lineToRelative(56f, 0f)
                lineToRelative(80f, 112f)
                lineToRelative(64f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 48f)
                lineToRelative(24f, 24f)
                lineToRelative(-24f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 160f)
                lineToRelative(24f, 24f)
                lineToRelative(-24f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(147.66f, 100.47f)
                lineToRelative(20.34f, -28.47f)
                lineToRelative(64f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 184f)
                lineToRelative(56f, 0f)
                lineToRelative(20.34f, -28.47f)
            }
        }.build()

        return _ShuffleAngularDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ShuffleAngularDuotone: ImageVector? = null
