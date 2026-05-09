package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ExamFill: ImageVector
    get() {
        if (_ExamFill != null) {
            return _ExamFill!!
        }
        _ExamFill = ImageVector.Builder(
            name = "Filled.ExamFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(96f, 113.89f)
                lineTo(107.06f, 136f)
                horizontalLineTo(84.94f)
                close()
                moveTo(232f, 56f)
                verticalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.58f, 7.16f)
                lineTo(192f, 208.94f)
                lineToRelative(-28.42f, 14.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.16f, 0f)
                lineTo(128f, 208.94f)
                lineTo(99.58f, 223.16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.16f, 0f)
                lineTo(64f, 208.94f)
                lineTo(35.58f, 223.16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 216f)
                verticalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                horizontalLineTo(216f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 56f)
                close()
                moveTo(135.16f, 156.42f)
                lineToRelative(-32f, -64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.32f, 0f)
                lineToRelative(-32f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.32f, 7.16f)
                lineTo(76.94f, 152f)
                horizontalLineToRelative(38.12f)
                lineToRelative(5.78f, 11.58f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.32f, -7.16f)
                close()
                moveTo(208f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineTo(184f)
                verticalLineTo(104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(16f)
                horizontalLineTo(152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(136f)
                horizontalLineToRelative(16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 128f)
                close()
            }
        }.build()

        return _ExamFill!!
    }

@Suppress("ObjectPropertyName")
private var _ExamFill: ImageVector? = null
