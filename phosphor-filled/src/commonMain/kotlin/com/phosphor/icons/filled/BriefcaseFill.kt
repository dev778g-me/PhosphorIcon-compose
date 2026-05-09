package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BriefcaseFill: ImageVector
    get() {
        if (_BriefcaseFill != null) {
            return _BriefcaseFill!!
        }
        _BriefcaseFill = ImageVector.Builder(
            name = "Filled.BriefcaseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(112f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 112f)
                close()
                moveTo(232f, 72f)
                lineTo(232f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(24f, 72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 56f)
                lineTo(80f, 56f)
                lineTo(80f, 48f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
                horizontalLineToRelative(48f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 72f)
                close()
                moveTo(96f, 56f)
                horizontalLineToRelative(64f)
                lineTo(160f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(104f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                close()
                moveTo(216f, 113.61f)
                lineTo(216f, 72f)
                lineTo(40f, 72f)
                verticalLineToRelative(41.61f)
                arcTo(184f, 184f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 136f)
                arcTo(184f, 184f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 113.61f)
                close()
            }
        }.build()

        return _BriefcaseFill!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseFill: ImageVector? = null
