package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.UserCirclePlusFill: ImageVector
    get() {
        if (_UserCirclePlusFill != null) {
            return _UserCirclePlusFill!!
        }
        _UserCirclePlusFill = ImageVector.Builder(
            name = "Filled.UserCirclePlusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 76f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, -44f, 44f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 76f)
                close()
                moveTo(176f, 64f)
                horizontalLineToRelative(16f)
                lineTo(192f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(208f, 64f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(208f, 48f)
                lineTo(208f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(192f, 48f)
                lineTo(176f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                close()
                moveTo(221.35f, 104.11f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.57f, 9.21f)
                arcTo(88.85f, 88.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 128f)
                arcToRelative(87.62f, 87.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.24f, 58.41f)
                arcTo(79.86f, 79.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 172f, 165.1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.84f, 0.32f)
                arcToRelative(59.81f, 59.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -78.27f, 0f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 84f, 165.1f)
                arcToRelative(79.71f, 79.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21.79f, 21.31f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 40f)
                arcToRelative(88.76f, 88.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.68f, 1.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.64f, -15.78f)
                arcToRelative(103.92f, 103.92f, 0f, isMoreThanHalf = true, isPositiveArc = false, 85.24f, 85.24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 221.35f, 104.11f)
                close()
            }
        }.build()

        return _UserCirclePlusFill!!
    }

@Suppress("ObjectPropertyName")
private var _UserCirclePlusFill: ImageVector? = null
