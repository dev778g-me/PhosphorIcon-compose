package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NotMemberOfFill: ImageVector
    get() {
        if (_NotMemberOfFill != null) {
            return _NotMemberOfFill!!
        }
        _NotMemberOfFill = ImageVector.Builder(
            name = "Filled.NotMemberOfFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                horizontalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(190f, 69.27f)
                lineTo(145.63f, 120f)
                horizontalLineTo(176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineTo(131.63f)
                lineToRelative(-28.76f, 32.87f)
                arcTo(47.72f, 47.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 176f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineTo(128f)
                arcToRelative(63.62f, 63.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, -35.78f, -11f)
                lineTo(78f, 197.27f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, -10.54f)
                lineToRelative(14.21f, -16.24f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 64f)
                horizontalLineToRelative(45.37f)
                lineTo(178f, 58.73f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 10.54f)
                close()
                moveTo(128f, 80f)
                horizontalLineToRelative(31.37f)
                lineToRelative(-35f, 40f)
                horizontalLineTo(80.68f)
                arcTo(48.07f, 48.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 80f)
                close()
                moveTo(80.68f, 136f)
                horizontalLineToRelative(29.69f)
                lineTo(90.84f, 158.32f)
                arcTo(47.78f, 47.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80.68f, 136f)
                close()
            }
        }.build()

        return _NotMemberOfFill!!
    }

@Suppress("ObjectPropertyName")
private var _NotMemberOfFill: ImageVector? = null
