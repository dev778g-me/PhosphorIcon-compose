package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SparkleFill: ImageVector
    get() {
        if (_SparkleFill != null) {
            return _SparkleFill!!
        }
        _SparkleFill = ImageVector.Builder(
            name = "Filled.SparkleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 144f)
                arcToRelative(15.78f, 15.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.42f, 14.94f)
                lineTo(146f, 178f)
                lineToRelative(-19f, 51.62f)
                arcToRelative(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -29.88f, 0f)
                lineTo(78f, 178f)
                lineToRelative(-51.62f, -19f)
                arcToRelative(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -29.88f)
                lineTo(78f, 110f)
                lineToRelative(19f, -51.62f)
                arcToRelative(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.88f, 0f)
                lineTo(146f, 110f)
                lineToRelative(51.62f, 19f)
                arcTo(15.78f, 15.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 144f)
                close()
                moveTo(152f, 48f)
                horizontalLineToRelative(16f)
                lineTo(168f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(184f, 48f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(184f, 32f)
                lineTo(184f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(168f, 32f)
                lineTo(152f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                close()
                moveTo(240f, 80f)
                horizontalLineToRelative(-8f)
                lineTo(232f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(232f, 96f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
            }
        }.build()

        return _SparkleFill!!
    }

@Suppress("ObjectPropertyName")
private var _SparkleFill: ImageVector? = null
