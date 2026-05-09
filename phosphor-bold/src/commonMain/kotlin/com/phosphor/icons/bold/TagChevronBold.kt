package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.TagChevronBold: ImageVector
    get() {
        if (_TagChevronBold != null) {
            return _TagChevronBold!!
        }
        _TagChevronBold = ImageVector.Builder(
            name = "Bold.TagChevronBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 200f)
                horizontalLineTo(187.72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.65f, -3.56f)
                lineTo(240f, 128f)
                lineTo(194.37f, 59.56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 187.72f, 56f)
                horizontalLineTo(32f)
                lineToRelative(48f, 72f)
                close()
            }
        }.build()

        return _TagChevronBold!!
    }

@Suppress("ObjectPropertyName")
private var _TagChevronBold: ImageVector? = null
