package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FolderDashedFill: ImageVector
    get() {
        if (_FolderDashedFill != null) {
            return _FolderDashedFill!!
        }
        _FolderDashedFill = ImageVector.Builder(
            name = "Filled.FolderDashedFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(96f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(39.38f, 216f)
                arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 200.62f)
                lineTo(24f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(8f)
                lineTo(88f, 200f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 208f)
                close()
                moveTo(160f, 200f)
                lineTo(128f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(224f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(48f)
                lineTo(200f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(16.89f)
                arcTo(15.13f, 15.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 200.89f)
                lineTo(232f, 152f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 144f)
                close()
                moveTo(216f, 72f)
                lineTo(168f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(232f, 88f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 72f)
                close()
                moveTo(32f, 88f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -13.66f)
                lineTo(104f, 44.69f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92.69f, 40f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                lineTo(24f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 88f)
                close()
                moveTo(32f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(40f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 160f)
                close()
            }
        }.build()

        return _FolderDashedFill!!
    }

@Suppress("ObjectPropertyName")
private var _FolderDashedFill: ImageVector? = null
