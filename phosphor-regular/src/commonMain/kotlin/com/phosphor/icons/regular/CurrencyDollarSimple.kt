package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.CurrencyDollarSimple: ImageVector
    get() {
        if (_CurrencyDollarSimple != null) {
            return _CurrencyDollarSimple!!
        }
        _CurrencyDollarSimple = ImageVector.Builder(
            name = "Regular.CurrencyDollarSimple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 24f)
                lineTo(128f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 208f)
                lineTo(128f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 88f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, -40f)
                horizontalLineTo(112f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 80f)
                horizontalLineToRelative(40f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 80f)
                horizontalLineTo(104f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, -40f)
            }
        }.build()

        return _CurrencyDollarSimple!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyDollarSimple: ImageVector? = null
