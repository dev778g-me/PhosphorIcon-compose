package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.StairsFill: ImageVector
    get() {
        if (_StairsFill != null) {
            return _StairsFill!!
        }
        _StairsFill = ImageVector.Builder(
            name = "Filled.StairsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 24f)
                lineTo(56f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(200f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(216f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 24f)
                close()
                moveTo(160f, 104f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(24f)
                lineTo(160f, 128f)
                close()
                moveTo(112f, 144f)
                horizontalLineToRelative(88f)
                verticalLineToRelative(24f)
                lineTo(112f, 168f)
                close()
                moveTo(200f, 216f)
                lineTo(56f, 216f)
                lineTo(56f, 184f)
                lineTo(200f, 184f)
                verticalLineToRelative(32f)
                close()
            }
        }.build()

        return _StairsFill!!
    }

@Suppress("ObjectPropertyName")
private var _StairsFill: ImageVector? = null
