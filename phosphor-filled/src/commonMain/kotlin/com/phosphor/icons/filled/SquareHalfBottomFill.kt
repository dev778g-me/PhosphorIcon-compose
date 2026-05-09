package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SquareHalfBottomFill: ImageVector
    get() {
        if (_SquareHalfBottomFill != null) {
            return _SquareHalfBottomFill!!
        }
        _SquareHalfBottomFill = ImageVector.Builder(
            name = "Filled.SquareHalfBottomFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 40f)
                lineTo(56f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 56f)
                lineTo(40f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(200f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(216f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 40f)
                close()
                moveTo(200f, 56f)
                verticalLineToRelative(72f)
                lineTo(56f, 128f)
                lineTo(56f, 56f)
                close()
            }
        }.build()

        return _SquareHalfBottomFill!!
    }

@Suppress("ObjectPropertyName")
private var _SquareHalfBottomFill: ImageVector? = null
