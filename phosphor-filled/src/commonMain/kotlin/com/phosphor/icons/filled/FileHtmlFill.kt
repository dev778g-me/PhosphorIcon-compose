package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FileHtmlFill: ImageVector
    get() {
        if (_FileHtmlFill != null) {
            return _FileHtmlFill!!
        }
        _FileHtmlFill = ImageVector.Builder(
            name = "Filled.FileHtmlFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(44f, 128f)
                lineTo(212f, 128f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(216f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.34f, -5.66f)
                lineToRelative(-56f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 24f)
                lineTo(56f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                verticalLineToRelative(84f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 44f, 128f)
                close()
                moveTo(152f, 44f)
                lineToRelative(44f, 44f)
                lineTo(152f, 88f)
                close()
                moveTo(68f, 160f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(52f, 192f)
                lineTo(32f, 192f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(16f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(16f)
                lineTo(52f, 176f)
                lineTo(52f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(124f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(92f, 168f)
                lineTo(84f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 124f, 160f)
                close()
                moveTo(196f, 160f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(180f, 184f)
                lineToRelative(-9.6f, 12.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.8f, 0f)
                lineTo(148f, 184f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(132f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.4f, -4.8f)
                lineTo(164f, 178.67f)
                lineToRelative(17.6f, -23.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 196f, 160f)
                close()
                moveTo(252f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(216f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(208f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 252f, 208f)
                close()
            }
        }.build()

        return _FileHtmlFill!!
    }

@Suppress("ObjectPropertyName")
private var _FileHtmlFill: ImageVector? = null
