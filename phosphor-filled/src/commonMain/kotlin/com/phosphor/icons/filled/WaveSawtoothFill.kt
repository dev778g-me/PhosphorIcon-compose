package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.WaveSawtoothFill: ImageVector
    get() {
        if (_WaveSawtoothFill != null) {
            return _WaveSawtoothFill!!
        }
        _WaveSawtoothFill = ImageVector.Builder(
            name = "Filled.WaveSawtoothFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                lineTo(24f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(204.44f, 134.66f)
                lineTo(132.44f, 182.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(120f, 95f)
                lineTo(60.44f, 134.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8.88f, -13.32f)
                lineToRelative(72f, -48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 80f)
                verticalLineToRelative(81.05f)
                lineToRelative(59.56f, -39.71f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.88f, 13.32f)
                close()
            }
        }.build()

        return _WaveSawtoothFill!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSawtoothFill: ImageVector? = null
