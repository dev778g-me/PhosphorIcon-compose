package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.DotsSixThin: ImageVector
    get() {
        if (_DotsSixThin != null) {
            return _DotsSixThin!!
        }
        _DotsSixThin = ImageVector.Builder(
            name = "Thin.DotsSixThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(60f, 92f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 92f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(196f, 92f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(60f, 164f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 164f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(196f, 164f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
        }.build()

        return _DotsSixThin!!
    }

@Suppress("ObjectPropertyName")
private var _DotsSixThin: ImageVector? = null
