package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FloppyDiskBackFill: ImageVector
    get() {
        if (_FloppyDiskBackFill != null) {
            return _FloppyDiskBackFill!!
        }
        _FloppyDiskBackFill = ImageVector.Builder(
            name = "Filled.FloppyDiskBackFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                horizontalLineTo(83.31f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 36.69f)
                lineTo(36.69f, 72f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 83.31f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(128f, 184f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 184f)
                close()
                moveTo(172f, 80f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                horizontalLineTo(88f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                verticalLineTo(48f)
                horizontalLineToRelative(88f)
                close()
            }
        }.build()

        return _FloppyDiskBackFill!!
    }

@Suppress("ObjectPropertyName")
private var _FloppyDiskBackFill: ImageVector? = null
