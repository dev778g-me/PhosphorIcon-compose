package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.RobotBold: ImageVector
    get() {
        if (_RobotBold != null) {
            return _RobotBold!!
        }
        _RobotBold = ImageVector.Builder(
            name = "Bold.RobotBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(88f, 104f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 104f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 56f)
                lineTo(200f, 56f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 80f)
                lineTo(224f, 192f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 216f)
                lineTo(56f, 216f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 192f)
                lineTo(32f, 80f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 56f)
                lineTo(128f, 16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(86f, 144f)
                lineTo(170f, 144f)
                arcTo(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 188f, 162f)
                lineTo(188f, 162f)
                arcTo(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 170f, 180f)
                lineTo(86f, 180f)
                arcTo(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68f, 162f)
                lineTo(68f, 162f)
                arcTo(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 86f, 144f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148f, 144f)
                lineTo(148f, 180f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(108f, 144f)
                lineTo(108f, 180f)
            }
        }.build()

        return _RobotBold!!
    }

@Suppress("ObjectPropertyName")
private var _RobotBold: ImageVector? = null
