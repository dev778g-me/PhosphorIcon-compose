package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ArrowUpLeftDuotone: ImageVector
    get() {
        if (_ArrowUpLeftDuotone != null) {
            return _ArrowUpLeftDuotone!!
        }
        _ArrowUpLeftDuotone = ImageVector.Builder(
            name = "Duotone.ArrowUpLeftDuotone",
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
                moveTo(168f, 64f)
                lineToRelative(-104f, 0f)
                lineToRelative(0f, 104f)
                lineToRelative(104f, -104f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 192f)
                lineTo(116f, 116f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 64f)
                lineToRelative(-104f, 0f)
                lineToRelative(0f, 104f)
                lineToRelative(104f, -104f)
                close()
            }
        }.build()

        return _ArrowUpLeftDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpLeftDuotone: ImageVector? = null
