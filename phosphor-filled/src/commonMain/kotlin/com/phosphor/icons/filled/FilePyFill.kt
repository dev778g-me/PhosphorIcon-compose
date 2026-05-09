package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FilePyFill: ImageVector
    get() {
        if (_FilePyFill != null) {
            return _FilePyFill!!
        }
        _FilePyFill = ImageVector.Builder(
            name = "Filled.FilePyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.66f, 82.34f)
                lineToRelative(-56f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 24f)
                lineTo(56f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                verticalLineToRelative(76f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                lineTo(172f, 120f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                lineTo(176f, 228f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(20f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(216f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 213.66f, 82.34f)
                close()
                moveTo(152f, 88f)
                lineTo(152f, 44f)
                lineToRelative(44f, 44f)
                close()
                moveTo(64f, 144f)
                lineTo(48f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(55.73f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 47.47f, 216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 208f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(7.4f)
                curveToRelative(15.24f, 0f, 28.14f, -11.92f, 28.59f, -27.15f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 144f)
                close()
                moveTo(63.65f, 184f)
                lineTo(56f, 184f)
                lineTo(56f, 160f)
                horizontalLineToRelative(8f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13.16f)
                arcTo(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63.65f, 184f)
                close()
                moveTo(154.65f, 156.52f)
                lineTo(136f, 186.29f)
                verticalLineToRelative(21.44f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.47f, 8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.53f, -8f)
                lineTo(120f, 186.29f)
                lineToRelative(-18.61f, -29.77f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.16f, -11.17f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.23f, 2.41f)
                lineTo(128f, 168.91f)
                lineToRelative(13.22f, -21.15f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.23f, -2.41f)
                arcTo(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 154.61f, 156.52f)
                close()
            }
        }.build()

        return _FilePyFill!!
    }

@Suppress("ObjectPropertyName")
private var _FilePyFill: ImageVector? = null
