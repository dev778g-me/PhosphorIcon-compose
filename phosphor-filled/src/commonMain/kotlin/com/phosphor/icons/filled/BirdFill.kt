package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BirdFill: ImageVector
    get() {
        if (_BirdFill != null) {
            return _BirdFill!!
        }
        _BirdFill = ImageVector.Builder(
            name = "Filled.BirdFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(236.44f, 73.34f)
                lineTo(213.21f, 57.86f)
                arcTo(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, 156f, 16f)
                horizontalLineToRelative(-0.29f)
                curveTo(122.79f, 16.16f, 96f, 43.47f, 96f, 76.89f)
                verticalLineTo(96.63f)
                lineTo(11.63f, 197.88f)
                lineToRelative(-0.1f, 0.12f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 224f)
                horizontalLineToRelative(88f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 120f)
                verticalLineTo(100.28f)
                lineToRelative(20.44f, -13.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.32f)
                close()
                moveTo(126.15f, 133.12f)
                lineToRelative(-60f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.29f, -10.24f)
                lineToRelative(60f, -72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.29f, 10.24f)
                close()
                moveTo(164f, 80f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164f, 80f)
                close()
            }
        }.build()

        return _BirdFill!!
    }

@Suppress("ObjectPropertyName")
private var _BirdFill: ImageVector? = null
