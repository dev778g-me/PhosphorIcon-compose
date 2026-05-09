package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CornersInFill: ImageVector
    get() {
        if (_CornersInFill != null) {
            return _CornersInFill!!
        }
        _CornersInFill = ImageVector.Builder(
            name = "Filled.CornersInFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 96f)
                verticalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                lineToRelative(48f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 104f)
                horizontalLineTo(160f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 96f)
                close()
                moveTo(96f, 152f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 13.66f)
                lineToRelative(48f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 208f)
                verticalLineTo(160f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 152f)
                close()
                moveTo(99.06f, 40.61f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.72f, 1.73f)
                lineToRelative(-48f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 104f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 99.06f, 40.61f)
                close()
                moveTo(208f, 152f)
                horizontalLineTo(160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.66f, 5.66f)
                lineToRelative(48f, -48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 152f)
                close()
            }
        }.build()

        return _CornersInFill!!
    }

@Suppress("ObjectPropertyName")
private var _CornersInFill: ImageVector? = null
