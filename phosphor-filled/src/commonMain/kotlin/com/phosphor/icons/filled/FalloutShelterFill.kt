package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FalloutShelterFill: ImageVector
    get() {
        if (_FalloutShelterFill != null) {
            return _FalloutShelterFill!!
        }
        _FalloutShelterFill = ImageVector.Builder(
            name = "Filled.FalloutShelterFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(231.94f, 124.55f)
                curveToRelative(-1.77f, -54.49f, -46f, -98.72f, -100.49f, -100.49f)
                arcTo(104.09f, 104.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24.06f, 131.45f)
                curveToRelative(1.77f, 54.49f, 46f, 98.72f, 100.49f, 100.49f)
                arcTo(104.09f, 104.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 231.94f, 124.55f)
                close()
                moveTo(198.38f, 141.47f)
                lineTo(174.93f, 174.3f)
                arcToRelative(8.52f, 8.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.86f, 0f)
                lineTo(128f, 128f)
                lineTo(94.93f, 174.3f)
                arcToRelative(8.52f, 8.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.86f, 0f)
                lineTo(57.62f, 141.47f)
                arcTo(8.52f, 8.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.55f, 128f)
                lineTo(128f, 128f)
                lineTo(97.62f, 85.47f)
                arcTo(8.52f, 8.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104.55f, 72f)
                horizontalLineToRelative(46.9f)
                arcToRelative(8.52f, 8.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.93f, 13.47f)
                lineTo(128f, 128f)
                horizontalLineToRelative(63.45f)
                arcTo(8.52f, 8.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 198.38f, 141.47f)
                close()
            }
        }.build()

        return _FalloutShelterFill!!
    }

@Suppress("ObjectPropertyName")
private var _FalloutShelterFill: ImageVector? = null
