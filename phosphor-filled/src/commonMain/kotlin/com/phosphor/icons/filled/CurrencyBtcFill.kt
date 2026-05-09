package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CurrencyBtcFill: ImageVector
    get() {
        if (_CurrencyBtcFill != null) {
            return _CurrencyBtcFill!!
        }
        _CurrencyBtcFill = ImageVector.Builder(
            name = "Filled.CurrencyBtcFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(176f, 152f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(112f, 168f)
                lineTo(112f, 136f)
                horizontalLineToRelative(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 152f)
                close()
                moveTo(240f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 136f, 24f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 128f)
                close()
                moveTo(192f, 152f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.51f, -27.42f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 73f)
                lineTo(160f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(8f)
                lineTo(128f, 72f)
                lineTo(128f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(8f)
                lineTo(96f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                verticalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineToRelative(-8f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 152f)
                close()
                moveTo(168f, 104f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(112f, 88f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 104f)
                close()
            }
        }.build()

        return _CurrencyBtcFill!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyBtcFill: ImageVector? = null
