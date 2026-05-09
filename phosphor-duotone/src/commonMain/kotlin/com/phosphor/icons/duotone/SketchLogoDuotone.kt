package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.SketchLogoDuotone: ImageVector
    get() {
        if (_SketchLogoDuotone != null) {
            return _SketchLogoDuotone!!
        }
        _SketchLogoDuotone = ImageVector.Builder(
            name = "Duotone.SketchLogoDuotone",
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
                moveTo(80f, 104f)
                lineToRelative(48f, -64f)
                lineToRelative(56f, 0f)
                lineToRelative(56f, 64f)
                lineToRelative(-112f, 120f)
                lineToRelative(-48f, -120f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 40f)
                lineToRelative(112f, 0f)
                lineToRelative(56f, 64f)
                lineToRelative(-112f, 120f)
                lineToRelative(-112f, -120f)
                lineToRelative(56f, -64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 104f)
                lineToRelative(-48f, 120f)
                lineToRelative(-48f, -120f)
                lineToRelative(48f, -64f)
                lineToRelative(48f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 104f)
                lineTo(240f, 104f)
            }
        }.build()

        return _SketchLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SketchLogoDuotone: ImageVector? = null
