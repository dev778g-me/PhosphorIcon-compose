package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.ArrowBendLeftUp: ImageVector
    get() {
        if (_ArrowBendLeftUp != null) {
            return _ArrowBendLeftUp!!
        }
        _ArrowBendLeftUp = ImageVector.Builder(
            name = "Regular.ArrowBendLeftUp",
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
                moveTo(152f, 80f)
                lineToRelative(-48f, -48f)
                lineToRelative(-48f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 224f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -96f, -96f)
                verticalLineTo(32f)
            }
        }.build()

        return _ArrowBendLeftUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendLeftUp: ImageVector? = null
