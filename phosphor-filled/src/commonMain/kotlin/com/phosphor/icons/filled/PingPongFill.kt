package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PingPongFill: ImageVector
    get() {
        if (_PingPongFill != null) {
            return _PingPongFill!!
        }
        _PingPongFill = ImageVector.Builder(
            name = "Filled.PingPongFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 196f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.65f, -11.7f)
                lineToRelative(-38f, -27.15f)
                lineToRelative(17f, -16.95f)
                arcToRelative(39.67f, 39.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, -35.79f)
                arcToRelative(99.52f, 99.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -35.4f, -57.89f)
                arcTo(101.93f, 101.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 122.58f, 24f)
                arcTo(100.29f, 100.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 122.58f)
                arcToRelative(102.12f, 102.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.55f, 65.28f)
                arcToRelative(99.52f, 99.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 57.89f, 35.4f)
                arcToRelative(39.68f, 39.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 35.79f, -11f)
                lineToRelative(16.95f, -17f)
                lineToRelative(27.15f, 38f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 196f, 240f)
                curveToRelative(0.44f, 0f, 0.88f, 0.05f, 1.32f, 0.05f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.31f, -4.69f)
                lineToRelative(26.64f, -26.64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 196f)
                close()
                moveTo(197.4f, 224f)
                lineTo(164.77f, 178.31f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.85f, -3.32f)
                quadToRelative(-0.33f, 0f, -0.66f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 2.34f)
                lineToRelative(-23.63f, 23.63f)
                arcToRelative(23.68f, 23.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, -21.36f, 6.63f)
                arcToRelative(80.3f, 80.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.3f, -3.5f)
                lineToRelative(108.8f, -108.8f)
                arcToRelative(80.63f, 80.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 12.3f)
                arcToRelative(23.67f, 23.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.63f, 21.36f)
                lineTo(177.3f, 152.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 12.17f)
                lineTo(224f, 197.36f)
                close()
            }
        }.build()

        return _PingPongFill!!
    }

@Suppress("ObjectPropertyName")
private var _PingPongFill: ImageVector? = null
