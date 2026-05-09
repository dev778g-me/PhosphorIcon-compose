package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ArrowArcLeftDuotone: ImageVector
    get() {
        if (_ArrowArcLeftDuotone != null) {
            return _ArrowArcLeftDuotone!!
        }
        _ArrowArcLeftDuotone = ImageVector.Builder(
            name = "Duotone.ArrowArcLeftDuotone",
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
                moveTo(88f, 152f)
                lineToRelative(-64f, 0f)
                lineToRelative(0f, -64f)
                lineToRelative(64f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 152f)
                lineToRelative(-64f, 0f)
                lineToRelative(0f, -64f)
                lineToRelative(64f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 184f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 60.12f, 116.12f)
                lineTo(56f, 120f)
            }
        }.build()

        return _ArrowArcLeftDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowArcLeftDuotone: ImageVector? = null
