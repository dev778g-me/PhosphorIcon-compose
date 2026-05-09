package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CardholderFill: ImageVector
    get() {
        if (_CardholderFill != null) {
            return _CardholderFill!!
        }
        _CardholderFill = ImageVector.Builder(
            name = "Filled.CardholderFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 48f)
                lineTo(48f, 48f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 72f)
                lineTo(24f, 184f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                lineTo(208f, 208f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                lineTo(232f, 72f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 48f)
                close()
                moveTo(152f, 120f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(40f, 112f)
                lineTo(40f, 96f)
                lineTo(216f, 96f)
                verticalLineToRelative(16f)
                lineTo(160f, 112f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 120f)
                close()
                moveTo(48f, 64f)
                lineTo(208f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(8f)
                lineTo(40f, 80f)
                lineTo(40f, 72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 64f)
                close()
            }
        }.build()

        return _CardholderFill!!
    }

@Suppress("ObjectPropertyName")
private var _CardholderFill: ImageVector? = null
