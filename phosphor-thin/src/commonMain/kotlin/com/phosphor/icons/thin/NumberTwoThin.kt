package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.NumberTwoThin: ImageVector
    get() {
        if (_NumberTwoThin != null) {
            return _NumberTwoThin!!
        }
        _NumberTwoThin = ImageVector.Builder(
            name = "Thin.NumberTwoThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(91.33f, 72f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 68.61f, 40.07f)
                lineTo(88f, 208f)
                horizontalLineToRelative(80f)
            }
        }.build()

        return _NumberTwoThin!!
    }

@Suppress("ObjectPropertyName")
private var _NumberTwoThin: ImageVector? = null
