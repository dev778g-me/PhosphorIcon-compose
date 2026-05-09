package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ArrowBendDoubleUpLeftBold: ImageVector
    get() {
        if (_ArrowBendDoubleUpLeftBold != null) {
            return _ArrowBendDoubleUpLeftBold!!
        }
        _ArrowBendDoubleUpLeftBold = ImageVector.Builder(
            name = "Bold.ArrowBendDoubleUpLeftBold",
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
                moveTo(80f, 152f)
                lineToRelative(-48f, -48f)
                lineToRelative(48f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 152f)
                lineToRelative(-48f, -48f)
                lineToRelative(48f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 200f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, -96f)
                horizontalLineTo(88f)
            }
        }.build()

        return _ArrowBendDoubleUpLeftBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendDoubleUpLeftBold: ImageVector? = null
