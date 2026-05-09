package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TriangleDashedFill: ImageVector
    get() {
        if (_TriangleDashedFill != null) {
            return _TriangleDashedFill!!
        }
        _TriangleDashedFill = ImageVector.Builder(
            name = "Filled.TriangleDashedFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(236.8f, 188.09f)
                lineTo(149.35f, 36.22f)
                arcToRelative(24.76f, 24.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -42.7f, 0f)
                lineTo(19.2f, 188.09f)
                arcToRelative(23.51f, 23.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 23.72f)
                arcTo(24.34f, 24.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40.55f, 224f)
                horizontalLineToRelative(174.9f)
                arcToRelative(24.34f, 24.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.33f, -12.19f)
                arcTo(23.51f, 23.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 236.8f, 188.09f)
                close()
                moveTo(108f, 200f)
                lineTo(60.79f, 200f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 50.4f, 182f)
                lineToRelative(24.18f, -42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.87f, 8f)
                lineTo(67.71f, 184f)
                lineTo(108f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(106.88f, 116f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 93f, 108f)
                lineToRelative(24.59f, -42.7f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.8f, 0f)
                lineTo(163f, 108f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.87f, 8f)
                lineTo(128f, 79.31f)
                close()
                moveTo(205.6f, 194f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.39f, 6f)
                lineTo(148f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(40.29f)
                lineToRelative(-20.74f, -36f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.87f, -8f)
                lineToRelative(24.18f, 42f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 205.6f, 194f)
                close()
            }
        }.build()

        return _TriangleDashedFill!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleDashedFill: ImageVector? = null
