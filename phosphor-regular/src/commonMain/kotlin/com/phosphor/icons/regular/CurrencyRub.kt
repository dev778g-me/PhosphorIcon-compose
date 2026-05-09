package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.CurrencyRub: ImageVector
    get() {
        if (_CurrencyRub != null) {
            return _CurrencyRub!!
        }
        _CurrencyRub = ImageVector.Builder(
            name = "Regular.CurrencyRub",
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
                moveTo(56f, 176f)
                lineTo(144f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 216f)
                verticalLineTo(40f)
                horizontalLineToRelative(60f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 104f)
                horizontalLineTo(56f)
            }
        }.build()

        return _CurrencyRub!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyRub: ImageVector? = null
