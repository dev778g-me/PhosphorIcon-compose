package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FolderSimpleMinusFill: ImageVector
    get() {
        if (_FolderSimpleMinusFill != null) {
            return _FolderSimpleMinusFill!!
        }
        _FolderSimpleMinusFill = ImageVector.Builder(
            name = "Filled.FolderSimpleMinusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 72f)
                lineTo(130.67f, 72f)
                lineTo(102.93f, 51.2f)
                arcToRelative(16.12f, 16.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.6f, -3.2f)
                lineTo(40f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 64f)
                lineTo(24f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216.89f, 216f)
                arcTo(15.13f, 15.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 200.89f)
                lineTo(232f, 88f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 72f)
                close()
                moveTo(152f, 152f)
                lineTo(104f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _FolderSimpleMinusFill!!
    }

@Suppress("ObjectPropertyName")
private var _FolderSimpleMinusFill: ImageVector? = null
