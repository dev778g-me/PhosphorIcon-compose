package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ProjectorScreenFill: ImageVector
    get() {
        if (_ProjectorScreenFill != null) {
            return _ProjectorScreenFill!!
        }
        _ProjectorScreenFill = ImageVector.Builder(
            name = "Filled.ProjectorScreenFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 64f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                horizontalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 48f)
                verticalLineTo(64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 80f)
                verticalLineToRelative(96f)
                horizontalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(88f)
                verticalLineToRelative(17.38f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 0f)
                verticalLineTo(192f)
                horizontalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineToRelative(-8f)
                verticalLineTo(80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 64f)
                close()
                moveTo(128f, 240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, -8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 240f)
                close()
                moveTo(40f, 48f)
                horizontalLineTo(216f)
                verticalLineTo(64f)
                horizontalLineTo(40f)
                close()
            }
        }.build()

        return _ProjectorScreenFill!!
    }

@Suppress("ObjectPropertyName")
private var _ProjectorScreenFill: ImageVector? = null
