package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.TipiDuotone: ImageVector
    get() {
        if (_TipiDuotone != null) {
            return _TipiDuotone!!
        }
        _TipiDuotone = ImageVector.Builder(
            name = "Duotone.TipiDuotone",
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
                moveTo(71.68f, 216f)
                lineToRelative(56.32f, -88f)
                lineToRelative(56.32f, 88f)
                lineToRelative(-112.64f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 16f)
                lineToRelative(128f, 200f)
                lineToRelative(-208f, 0f)
                lineToRelative(128f, -200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(71.68f, 216f)
                lineToRelative(56.32f, -88f)
                lineToRelative(56.32f, 88f)
            }
        }.build()

        return _TipiDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TipiDuotone: ImageVector? = null
