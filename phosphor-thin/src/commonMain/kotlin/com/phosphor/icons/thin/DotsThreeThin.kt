package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.DotsThreeThin: ImageVector
    get() {
        if (_DotsThreeThin != null) {
            return _DotsThreeThin!!
        }
        _DotsThreeThin = ImageVector.Builder(
            name = "Thin.DotsThreeThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 128f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(60f, 128f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(196f, 128f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
        }.build()

        return _DotsThreeThin!!
    }

@Suppress("ObjectPropertyName")
private var _DotsThreeThin: ImageVector? = null
