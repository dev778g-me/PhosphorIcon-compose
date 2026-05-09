package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FireBold: ImageVector
    get() {
        if (_FireBold != null) {
            return _FireBold!!
        }
        _FireBold = ImageVector.Builder(
            name = "Bold.FireBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(166.17f, 156f)
                arcTo(40.11f, 40.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 140f, 182.17f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 96f)
                lineToRelative(26.27f, -72f)
                curveTo(159.86f, 41.92f, 208f, 88.15f, 208f, 144f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -160f, 0f)
                curveToRelative(0f, -30.57f, 14.42f, -58.26f, 31f, -80f)
                close()
            }
        }.build()

        return _FireBold!!
    }

@Suppress("ObjectPropertyName")
private var _FireBold: ImageVector? = null
