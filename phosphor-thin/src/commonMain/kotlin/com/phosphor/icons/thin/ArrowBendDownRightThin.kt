package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.ArrowBendDownRightThin: ImageVector
    get() {
        if (_ArrowBendDownRightThin != null) {
            return _ArrowBendDownRightThin!!
        }
        _ArrowBendDownRightThin = ImageVector.Builder(
            name = "Thin.ArrowBendDownRightThin",
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
                moveTo(176f, 104f)
                lineToRelative(48f, 48f)
                lineToRelative(-48f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 56f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 96f)
                horizontalLineToRelative(96f)
            }
        }.build()

        return _ArrowBendDownRightThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendDownRightThin: ImageVector? = null
