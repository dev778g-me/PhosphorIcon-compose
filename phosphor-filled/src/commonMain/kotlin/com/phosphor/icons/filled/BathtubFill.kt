package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BathtubFill: ImageVector
    get() {
        if (_BathtubFill != null) {
            return _BathtubFill!!
        }
        _BathtubFill = ImageVector.Builder(
            name = "Filled.BathtubFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 96f)
                lineTo(216f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(136f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(64f, 96f)
                lineTo(64f, 52f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 40f)
                arcToRelative(12.44f, 12.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.16f, 9.59f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.68f, -3.18f)
                arcTo(28.32f, 28.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 76f, 24f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 52f)
                lineTo(48f, 96f)
                lineTo(16f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(40f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 56f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(80f, 200f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(192f, 200f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, -56f)
                lineTo(248f, 104f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 96f)
                close()
                moveTo(200f, 104f)
                verticalLineToRelative(40f)
                lineTo(144f, 144f)
                lineTo(144f, 104f)
                close()
            }
        }.build()

        return _BathtubFill!!
    }

@Suppress("ObjectPropertyName")
private var _BathtubFill: ImageVector? = null
