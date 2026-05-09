package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HeartbeatFill: ImageVector
    get() {
        if (_HeartbeatFill != null) {
            return _HeartbeatFill!!
        }
        _HeartbeatFill = ImageVector.Builder(
            name = "Filled.HeartbeatFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 102f)
                curveToRelative(0f, 70f, -103.79f, 126.66f, -108.21f, 129f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.58f, 0f)
                curveToRelative(-3.35f, -1.8f, -63.55f, -34.69f, -92.68f, -80.89f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 34.92f, 144f)
                horizontalLineTo(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.66f, -3.56f)
                lineToRelative(9.34f, -14f)
                lineToRelative(25.34f, 38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.16f, 3.16f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.27f, -3.34f)
                lineTo(140.28f, 144f)
                horizontalLineTo(160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8.53f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.25f, -7.47f)
                horizontalLineTo(136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.66f, 3.56f)
                lineToRelative(-9.34f, 14f)
                lineToRelative(-25.34f, -38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.16f, -3.16f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.27f, 3.34f)
                lineTo(67.72f, 128f)
                horizontalLineTo(23.53f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.83f, -2.81f)
                arcTo(76.93f, 76.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 102f)
                arcTo(62.07f, 62.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78f, 40f)
                curveToRelative(20.65f, 0f, 38.73f, 8.88f, 50f, 23.89f)
                curveTo(139.27f, 48.88f, 157.35f, 40f, 178f, 40f)
                arcTo(62.07f, 62.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 102f)
                close()
            }
        }.build()

        return _HeartbeatFill!!
    }

@Suppress("ObjectPropertyName")
private var _HeartbeatFill: ImageVector? = null
