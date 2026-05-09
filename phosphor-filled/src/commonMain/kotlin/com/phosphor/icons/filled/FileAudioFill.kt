package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FileAudioFill: ImageVector
    get() {
        if (_FileAudioFill != null) {
            return _FileAudioFill!!
        }
        _FileAudioFill = ImageVector.Builder(
            name = "Filled.FileAudioFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 180f)
                arcToRelative(40.55f, 40.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20f, 34.91f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 124f, 201.09f)
                arcToRelative(24.49f, 24.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -42.18f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 132f, 145.09f)
                arcTo(40.55f, 40.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 180f)
                close()
                moveTo(99.06f, 128.61f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.72f, 1.73f)
                lineTo(68.69f, 152f)
                lineTo(48f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(68.69f, 208f)
                lineToRelative(21.65f, 21.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 224f)
                lineTo(104f, 136f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 99.06f, 128.61f)
                close()
                moveTo(216f, 88f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(168f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(32f)
                lineTo(200f, 96f)
                lineTo(152f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(144f, 40f)
                lineTo(56f, 40f)
                verticalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 24f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 2.34f)
                lineToRelative(56f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 88f)
                close()
                moveTo(160f, 80f)
                horizontalLineToRelative(28.69f)
                lineTo(160f, 51.31f)
                close()
            }
        }.build()

        return _FileAudioFill!!
    }

@Suppress("ObjectPropertyName")
private var _FileAudioFill: ImageVector? = null
