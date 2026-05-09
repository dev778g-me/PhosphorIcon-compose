package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.VirtualRealityFill: ImageVector
    get() {
        if (_VirtualRealityFill != null) {
            return _VirtualRealityFill!!
        }
        _VirtualRealityFill = ImageVector.Builder(
            name = "Filled.VirtualRealityFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(176f, 48f)
                horizontalLineTo(80f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 160f)
                horizontalLineToRelative(96f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -160f)
                close()
                moveTo(123.49f, 98.81f)
                lineToRelative(-24f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15f, 0f)
                lineToRelative(-24f, -64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15f, -5.62f)
                lineToRelative(16.51f, 44f)
                lineToRelative(16.51f, -44f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15f, 5.62f)
                close()
                moveTo(191f, 156f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.9f, 7.94f)
                lineToRelative(-11.44f, -20f)
                curveToRelative(-0.53f, 0f, -1.07f, 0.05f, -1.61f, 0.05f)
                horizontalLineTo(152f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(20f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.84f, 50.35f)
                close()
                moveTo(176f, 116f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, 12f)
                horizontalLineTo(152f)
                verticalLineTo(104f)
                horizontalLineToRelative(12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 116f)
                close()
            }
        }.build()

        return _VirtualRealityFill!!
    }

@Suppress("ObjectPropertyName")
private var _VirtualRealityFill: ImageVector? = null
