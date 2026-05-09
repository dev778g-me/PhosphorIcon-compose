package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ArrowElbowLeftDuotone: ImageVector
    get() {
        if (_ArrowElbowLeftDuotone != null) {
            return _ArrowElbowLeftDuotone!!
        }
        _ArrowElbowLeftDuotone = ImageVector.Builder(
            name = "Duotone.ArrowElbowLeftDuotone",
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
                moveTo(96f, 80f)
                lineToRelative(-72f, 0f)
                lineToRelative(0f, 72f)
                lineToRelative(72f, -72f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 80f)
                lineToRelative(-72f, 0f)
                lineToRelative(0f, 72f)
                lineToRelative(72f, -72f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 96f)
                lineToRelative(-96f, 96f)
                lineToRelative(-76f, -76f)
            }
        }.build()

        return _ArrowElbowLeftDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowLeftDuotone: ImageVector? = null
