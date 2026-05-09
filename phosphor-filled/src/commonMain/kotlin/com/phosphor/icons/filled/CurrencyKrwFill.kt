package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CurrencyKrwFill: ImageVector
    get() {
        if (_CurrencyKrwFill != null) {
            return _CurrencyKrwFill!!
        }
        _CurrencyKrwFill = ImageVector.Builder(
            name = "Filled.CurrencyKrwFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(200f, 144f)
                lineTo(181.42f, 144f)
                lineToRelative(-14f, 35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.86f, 0f)
                lineTo(128f, 117.54f)
                lineTo(103.43f, 179f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.86f, 0f)
                lineToRelative(-14f, -35f)
                lineTo(56f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(68.18f, 128f)
                lineTo(56.57f, 99f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 71.43f, 93f)
                lineTo(96f, 154.46f)
                lineTo(120.57f, 93f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.86f, 0f)
                lineTo(160f, 154.46f)
                lineTo(184.57f, 93f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 199.43f, 99f)
                lineToRelative(-11.61f, 29f)
                lineTo(200f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _CurrencyKrwFill!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyKrwFill: ImageVector? = null
