package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HandGrabbingFill: ImageVector
    get() {
        if (_HandGrabbingFill != null) {
            return _HandGrabbingFill!!
        }
        _HandGrabbingFill = ImageVector.Builder(
            name = "Filled.HandGrabbingFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 104f)
                verticalLineToRelative(48f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -176f, 0f)
                verticalLineTo(136f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                close()
            }
        }.build()

        return _HandGrabbingFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandGrabbingFill: ImageVector? = null
