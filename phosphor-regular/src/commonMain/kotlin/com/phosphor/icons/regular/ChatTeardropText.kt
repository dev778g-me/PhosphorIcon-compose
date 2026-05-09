package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.ChatTeardropText: ImageVector
    get() {
        if (_ChatTeardropText != null) {
            return _ChatTeardropText!!
        }
        _ChatTeardropText = ImageVector.Builder(
            name = "Regular.ChatTeardropText",
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
                moveTo(96f, 112f)
                lineTo(164f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 144f)
                lineTo(164f, 144f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(132f, 216f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(124f)
                arcToRelative(92f, 92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, -92f)
                horizontalLineToRelative(0f)
                arcToRelative(92f, 92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 92f)
                horizontalLineToRelative(0f)
                arcTo(92f, 92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 132f, 216f)
                close()
            }
        }.build()

        return _ChatTeardropText!!
    }

@Suppress("ObjectPropertyName")
private var _ChatTeardropText: ImageVector? = null
