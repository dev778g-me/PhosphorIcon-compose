package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HeadphonesFill: ImageVector
    get() {
        if (_HeadphonesFill != null) {
            return _HeadphonesFill!!
        }
        _HeadphonesFill = ImageVector.Builder(
            name = "Filled.HeadphonesFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 128f)
                verticalLineToRelative(56f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                horizontalLineTo(192f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                verticalLineTo(144f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
                horizontalLineToRelative(23.65f)
                arcToRelative(87.71f, 87.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, -87f, -80f)
                horizontalLineTo(128f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -87.64f, 80f)
                horizontalLineTo(64f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
                verticalLineToRelative(40f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                horizontalLineTo(48f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                verticalLineTo(128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 201.89f, 54.66f)
                arcTo(103.41f, 103.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
            }
        }.build()

        return _HeadphonesFill!!
    }

@Suppress("ObjectPropertyName")
private var _HeadphonesFill: ImageVector? = null
