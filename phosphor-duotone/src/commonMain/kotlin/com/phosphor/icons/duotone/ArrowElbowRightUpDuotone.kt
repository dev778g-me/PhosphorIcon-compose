package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ArrowElbowRightUpDuotone: ImageVector
    get() {
        if (_ArrowElbowRightUpDuotone != null) {
            return _ArrowElbowRightUpDuotone!!
        }
        _ArrowElbowRightUpDuotone = ImageVector.Builder(
            name = "Duotone.ArrowElbowRightUpDuotone",
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
                moveTo(120f, 96f)
                lineToRelative(48f, -48f)
                lineToRelative(48f, 48f)
                lineToRelative(-96f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 96f)
                lineToRelative(48f, -48f)
                lineToRelative(48f, 48f)
                lineToRelative(-96f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 192f)
                lineToRelative(144f, 0f)
                lineToRelative(0f, -96f)
            }
        }.build()

        return _ArrowElbowRightUpDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowRightUpDuotone: ImageVector? = null
