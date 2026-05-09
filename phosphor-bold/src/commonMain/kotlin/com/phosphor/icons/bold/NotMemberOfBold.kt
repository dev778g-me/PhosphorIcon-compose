package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.NotMemberOfBold: ImageVector
    get() {
        if (_NotMemberOfBold != null) {
            return _NotMemberOfBold!!
        }
        _NotMemberOfBold = ImageVector.Builder(
            name = "Bold.NotMemberOfBold",
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
                moveTo(208f, 40f)
                lineTo(48f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 48f)
                horizontalLineTo(128f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80f, 80f)
                horizontalLineToRelative(0f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 80f)
                horizontalLineToRelative(72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 128f)
                lineTo(48f, 128f)
            }
        }.build()

        return _NotMemberOfBold!!
    }

@Suppress("ObjectPropertyName")
private var _NotMemberOfBold: ImageVector? = null
